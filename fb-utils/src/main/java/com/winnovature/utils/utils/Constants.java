package com.winnovature.utils.utils;

public class Constants {
	public static final String UtilsLogger = "UtilsLogger";
	public static final String UPNotificationERRORLogger = "UPNotificationErrorLogger";

	// JNDIs
	public static final String MARIADB_JNDI_NAME_ACCOUNTS_DB = "mariadb.jndi.name.accountsdb";
	public static final String MARIADB_JNDI_NAME_CM_DB = "mariadb.jndi.name.cmdb";
	public static final String MARIADB_JNDI_NAME_CONFIG_DB = "mariadb.jndi.name.configdb";

	// Sleep times
	public static final String THREAD_SLEEP_TIME_IN_MILLISECONDS = "thread.sleep.time.in.milliseconds";
	public static final String CONSUMERS_SLEEP_TIME_IN_MILLI_SECONDS = "idle.thread.sleep.time.in.milliseconds";
	public static final String IDLE_THREAD_SLEEP_TIME_IN_MILLISECONDS = "idle.thread.sleep.time.in.milliseconds";

	// Others
	public static final String MONITORING_INSTANCE_ID = "instance.monitoring.id";
	public static final String FILE_SPLIT_QUEUE_NAME = "file.split.queue.name";
	public static final String GROUP_QUEUE_NAME = "group.queue.name";
	public static final String GROUP_CAMPAIGN_QUEUE_NAME = "groups.campaign.queue.name";
	public static final String MAX_RETRY_COUNT = "max.file.retry.count";
	public static final String FILEID_FOR_LOGGER = "fileId:";
	public static final String REDIS_HEART_BEAT_PARENT_KEY = "redis.heart.beat.parent.key";
	public static final String SPLIT_FILE_DELIMITER = "split.file.delimiter";
	public static final String EXCLUDE = "_exclude";
	public static final String DEFAULT_HIGH_VOL_QUEUE_NAME = "default.high.vol.delivery.queue.name";
	public static final String LINE_BREAK_REPLACER = "replace.newline.character.with";
	public static final String SPLIT_FILE_STORE_PATH = "split.file.store.path";
	public static final String PATTERN_DECIMALFORMATTER_FOR_DIGITS = "pattern.decimal.formatter.for.digits";
	public static final String UNSUPPORTED_ROW_HEADER = "ROW_STATUS";
	public static final String OS_SPECIFIC_LINE_BREAK = "\r\n|\r|\n";
	public static final String UNSUPPORTED_UC = "UNSUPPORTED_UC";
	public static final String STATS_UPDATE_STATUS_QUERY_QUEUE_NAME = "stats.update.status.query.queue.name";
	public static final String EXCLUDE_NUMBERS_INSERT_QUEUE_NAME = "unprocess.data.insert.queue.name";
	public static final String BATCH_UPDATE_COUNT = "batch.update.count";
	public static final String LINE_BREAK = System.lineSeparator();
	public static final String UNSUPPORTED_UNICODE_MSG = "Unsupported_unicode_msg";
	public static final String CAMPAIGNS_FILE_STORE_PATH = "campaigns.file.store.path";
	public static final String TEMPLATE_FILE_STORE_PATH = "template.file.store.path";
	public static final String GROUP_FILE_STORE_PATH = "group.file.store.path";
	public static final String CAMPAIGN = "campaign";
	public static final String TEMPLATE = "template";
	public static final String GROUP = "group";
	public static final String DLT = "dlt";
	public static final String ABANDONED_FILES_DELIMITER = "::";

	// Redis
	public static final int REDIS_STATUS = 1;
	public static final int REDIS_STATUS_FOR_NORMAL_GROUPS = 2;
	public static final int REDIS_STATUS_FOR_EXCLUDE_GROUPS = 3;
	public static final int REDIS_STATUS_HEART_BEAT = 4;
	public static final int REDIS_STATUS_FOR_DLT_FILE_PROCESS = 5;
	public static final int REDIS_STATUS_FOR_UNPROCESS = 6;
	public static final int REDIS_STATUS_FOR_DUPCHECK = 6;

	// activities table status
	public static final String ACTIVITIES_STATUS_UPDATE_QUEUE_NAME = "activities.status.update.queue.name";
	public static final String ACTIVITY_TABLE_COMPLETED_STATUS = "activity.table.statusCompleted";
	
	// date formats
	public static final String DATE_FORMAT_DD_MM_YYYY_HH_MM_SS = "dd-MM-yyyy HH:mm:ss";
	public static final String DATE_FORMAT_DDMMYYYY = "ddMMyyyy";
	
	// SMS types
	public static final String QUICK_CAMP = "quick";
	public static final String GROUP_CAMP = "group";
	public static final String OTM_CAMP = "otm";
	public static final String MTM_CAMP = "mtm";
	public static final String TEM_CAMP = "template";
	
	// MSG type
	public static final String MSG_TYPE_MULTI_LANG = "multiLang";
	public static final String MSG_TYPE_TEXT = "text";
	
	//Initial Stage
	public static final String InitialStageLogger = "InitialStageLogger";
	public static final String InitialStageHeartBeat = "InitialStageAlive";
	public static final String INSTANCE_ID = "instance.id";
	public static final String FETCH_SSR_ROW_LIMIT = "fetch.ssr.row.limit";
	public static final int UNSPLIT = 0;
	public static final int SPLIT = 1;
	
	
	///group processor
	
	public static final String GroupsProcessorLogger = "GroupsProcessorLogger";
	public static final String GroupsPollerRequired = "groups.poller.required";
	public static final String FILE_SMS_ALL_STATUS = "file.sms.all.status";
	public static final String PROCESS_STATUS_COMPLETED = "completed";
	public static final String PROCESS_STATUS_FAILED = "failed";
	public static final String PROCESS_STATUS_INPROGRESS = "inprocess";
	public static final String SPLIT_FILE_CONSUMERS_PER_REDIS = "split.file.consumers.per.redis";
	public static final String FILE_SPLIT_LIMIT = "file.split.limit";
	public static final String DEADLOCK_EXCEPTION_DEFAULT = "Deadlock found";
	public static final String PROCESS_STATUS_INVALIDFILE = "invalidfiles";
	public static final String FILE_SMS_INPROCESS_STATUS = "file.sms.inprocess.status";
	public static final String COMPLETED_STATUS = "status.completed";
	public static final String FAILED_STATUS = "status.failed";
	public static final String INVALID_STATUS = "status.invalid";
	public static final String GROUP_SPLIT_FILES_QUEUE = "group.split.files.queue";
	public static final String GROUPS_CONSUMERS_PER_REDIS = "groups.consumers.per.redis";
	public static final String REDIS_PUSH_BATCH_SIZE = "contacts.push.batch.size";
	public static final String GROUP_IDENTIFIER_EXCLUDE = "exclude";
	public static final String GROUP_IDENTIFIER_NORMAL = "normal";
	public static final String REDIS_QUEUE_NORMAL_GROUPS = "groups:contacts:group_id";
	public static final String REDIS_QUEUE_EXCLUDE_GROUPS = "excludegroups:contacts:group_id";
	public static final String REDIS_QUEUE_GROUPS_CONTACT_DETAILS = "groups:contactdetails:group_id";
	public static final String REDIS_QUEUE_EXCLUDE_GROUPS_CONTACT_DETAILS = "excludegroups:contactdetails:group_id";
	public static final String REDIS_QUEUE_GROUPS_OTHER_DETAILS = "groups:otherdetails";
	public static final String GROUPS_CAMPAIGN_Q_CONSUMERS_PER_REDIS = "groups.campaign.queue.consumers.per.redis";
	public static final String PROCESS_STATUS_GRPINPROGRESS = "ginprocess";
	
	
	//download
	
	
	public static final String DownloadHandlerLogger = "DownloadHandlerLogger";
	public static final String PROCESS_STATUS_XL_INPROCESS = "xl_inprocess";
	
	public static final String FileUploadLogger = "DLTFileUploadLogger";
	public static final String FILE_STORE_PATH = "file.store.path";
	public static final String UNSUPPORTED_FILE_TYPE = "Unsupported File Type";
	public static final String INTERNAL_SERVER_ERROR = "Internal Server Error";
	public static final int SUCCESS_STATUS_CODE = 200;
	public static final int INTERNAL_SERVER_ERROR_STATUS_CODE = 500;
	public static final String APPLICATION_ERROR = "Application Error";
	public static final int APPLICATION_ERROR_CODE = 300;
	public static final String GENERAL_ERROR_MESSAGE = "Error processing your uploads. Please try again";
	public static final String DLT_TEMPLATE_FILE_STORE_PATH = "dlt.template.file.store.path";
	public static final int ERROR_CODE_REQUIRED_PARAMS_MISSING = 400;
	
	public static final String FILES_ALL_STATUS = "files.all.status";
	public static final String DLT_FILE_QUEUE_NAME = "dlt.files.queue.name";
	public static final String DLT_FILE_POLLER_REQUIRED = "dlt.file.poller.required";
	public static final String DLT_FILE_CONSUMER_REQUIRED = "dlt.file.consumer.required";
	public static final String DLT_FILE_CONSUMER_COUNT = "dlt.file.consumers.count";

}
