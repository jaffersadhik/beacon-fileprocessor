package com.winnovature.initialstate.servlets;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.winnovature.initialstate.pollers.CampaignGroupsPoller;
import com.winnovature.initialstate.pollers.CampaignMasterPoller;
import com.winnovature.initialstate.pollers.DltTemplateRequestCompletionPoller;
import com.winnovature.initialstate.pollers.DltTemplateRequestPoller;
import com.winnovature.initialstate.pollers.GroupsMasterPoller;
import com.winnovature.initialstate.pollers.PollerDownloadReq;
import com.winnovature.logger.InitialStageLog;
import com.winnovature.utils.utils.Constants;

public class InitializePoller extends GenericServlet implements Servlet {

	private static final long serialVersionUID = 1L;
	static Log log = LogFactory.getLog(Constants.InitialStageLogger);
	private static final String className = "InitializePoller";
	CampaignMasterPoller campaignMasterPoller = null;
	CampaignGroupsPoller campaignGroupsPoller = null;
	GroupsMasterPoller groupsMasterPoller = null;
	PollerDownloadReq pollerDownladReq = null;
	DltTemplateRequestPoller dltTemplateRequestPoller = null;
	DltTemplateRequestCompletionPoller dltTemplateRequestCompletionPoller = null;
	@Override
	public void init() throws ServletException {
		super.init();
		
		
	
		InitialStageLog.getInstance().debug(className+" : init()  " );

			try {

				// thread to fetch records from campaign_master & campaign_files tables and HO to fileSplitQ/groupQ
				if (log.isDebugEnabled())
					log.debug(className + " CampaignMasterPoller/CampaignGroupsPoller starting...");

				campaignMasterPoller = new CampaignMasterPoller("CampaignMasterPoller");
				campaignMasterPoller.setName("CampaignMasterPoller");
				campaignMasterPoller.start();
				
				InitialStageLog.getInstance().debug(className+" : campaignMasterPoller.start()  " );


				if (log.isDebugEnabled())
					log.debug(className + " CampaignMasterPoller started.");
				
				campaignGroupsPoller = new CampaignGroupsPoller("CampaignGroupsPoller");
				campaignGroupsPoller.setName("CampaignGroupsPoller");
				campaignGroupsPoller.start();

				InitialStageLog.getInstance().debug(className+" : campaignGroupsPoller.start()  " );
				
				groupsMasterPoller = new GroupsMasterPoller("GroupsMasterPoller");
				groupsMasterPoller.setName("GroupsMasterPoller");
				groupsMasterPoller.start();
				
				InitialStageLog.getInstance().debug(className+" groupsMasterPoller.start() "+groupsMasterPoller.getName());
			
				pollerDownladReq = new PollerDownloadReq();
				pollerDownladReq.setName("PollerDownladReq");
				pollerDownladReq.start();

				InitialStageLog.getInstance().debug(className+" PollerDownloadReq.start() "+ pollerDownladReq.getName());

				if (log.isDebugEnabled())
					log.debug(className + " CampaignGroupsPoller started.");
				
				
				dltTemplateRequestPoller = new DltTemplateRequestPoller("dltTemplateRequestPoller");
				dltTemplateRequestPoller.setName("dltTemplateRequestPoller");
				dltTemplateRequestPoller.start();
				if (log.isDebugEnabled()) {
					log.debug(className + " dltTemplateRequestPoller started.");
				}
				
				InitialStageLog.getInstance().debug(className+ " dltTemplateRequestPoller started. : "+ dltTemplateRequestPoller.getName());

				dltTemplateRequestCompletionPoller = new DltTemplateRequestCompletionPoller();
				dltTemplateRequestCompletionPoller.setName("DltTemplateRequestCompletionPoller");
				dltTemplateRequestCompletionPoller.start();
				if (log.isDebugEnabled()) {
					log.debug(className + " DltTemplateRequestCompletionPoller started.");
				}

				InitialStageLog.getInstance().debug(className+ " DltTemplateRequestCompletionPoller started. : "+ dltTemplateRequestCompletionPoller.getName());

			} catch (Exception e) {
				log.error(className + " Exception:", e);
				log.error(className + " RESTART FP-InitialStage MODULE ");
			}

	
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

	}

}
