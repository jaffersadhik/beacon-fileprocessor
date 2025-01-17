package com.winnovature.downloadhandler.servlets;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.winnovature.downloadhandler.consumers.CsvToExcelConvertionRequestConsumer;
import com.winnovature.utils.utils.Constants;
import com.winnovature.utils.utils.DownloadHandlerPropertiesTon;

@WebServlet(name = "ServletInitializer", loadOnStartup = 1)
public class ServletInitializer extends GenericServlet implements Servlet {
	private static final long serialVersionUID = 1L;
	static Log log = LogFactory.getLog(Constants.DownloadHandlerLogger);
	private static final String className = "[ServletInitializer]";
	PropertiesConfiguration propertiesConfiguration = null;
	CsvToExcelConvertionRequestConsumer csvToExcelConvertor = null;
	boolean isPollerDownloadReqRequired = false;

	@Override
	public void init() throws ServletException {
		super.init();
		
		

		

			try {
				if (log.isDebugEnabled()) {
					log.debug(className + " InitializePollers Servlet started...");
				}
				propertiesConfiguration = DownloadHandlerPropertiesTon.getInstance().getPropertiesConfiguration();

				String isPollerRequired = propertiesConfiguration.getString("download_req.poller.required");

				if (StringUtils.isNotBlank(isPollerRequired)) {
					isPollerDownloadReqRequired = isPollerRequired.trim().equalsIgnoreCase("yes");
				}

				if (isPollerDownloadReqRequired) {
				
				}

				int consumersCount = propertiesConfiguration.getInt("csv.excel.convertion.consumers.count", 5);
				for (int i = 0; i < consumersCount; i++) {
					csvToExcelConvertor = new CsvToExcelConvertionRequestConsumer();
					csvToExcelConvertor.setName("CsvToExcelConvertionRequestConsumer" + (i + 1));
					csvToExcelConvertor.start();
				}

			} catch (Exception e) {
				log.error(className + " Exception:", e);
				log.error(className + " RESTART FP-DownloadHandler MODULE ");
			}

		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub

	}

}
