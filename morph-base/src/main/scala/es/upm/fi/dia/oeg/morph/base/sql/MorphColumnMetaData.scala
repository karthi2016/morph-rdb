package es.upm.fi.dia.oeg.morph.base.sql

import java.sql.Connection
import scala.collection.JavaConversions._
import org.apache.logging.log4j.LogManager

class MorphColumnMetaData (val tableName : String, val columnName : String
    , val dataType : String, val isNullable : Boolean, val characterMaximumLength:Long, val columnKey:Option[String]) {

	val logger = LogManager.getLogger(this.getClass);
	logger.debug("\t\tColumn MetaData created: " + this.tableName + "." + this.columnName);

//	override def toString() = {
//		val result = "ColumnMetaData [tableName=" + tableName + ", columnName=" + columnName + ", dataType=" + dataType + ", isNullable=" + isNullable + "]";
//		result;
//	}
	
//	def getDataType() = {
//	  this.dataType;
//	}
	
	def isPrimaryKeyColumn = {
	  this.columnKey.isDefined && this.columnKey.get.equals("PRI");
	}
}