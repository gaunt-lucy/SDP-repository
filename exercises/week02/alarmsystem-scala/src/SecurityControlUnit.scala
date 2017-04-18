import java.util.Calendar

import scala.collection.mutable.ListBuffer

/**
  * Created by Lucy on 19/03/2017.
//  */
class SecurityControlUnit (hazSensors: ListBuffer[SecuritySensor]) extends ControlUnit {
  val h = hazSensors

  def timeCheck = {
    val now = Calendar.getInstance()
    val curHour = now.get(Calendar.HOUR_OF_DAY)
    if ( curHour > 22.00 & curHour < 06.00 ) true else false
  }

  override def pollSensors: Unit = {
    if (timeCheck) super.pollSensors
  }

}
