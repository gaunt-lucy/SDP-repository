package prototype

class User(var userName: String,
           var level: String,
           var accessControl: AccessControl) {

  override def toString() = {
    val conLevel = accessControl.controlLevel
    val accLevel = accessControl.access
    f"User: $userName, Level: $level, Access Control Level: $conLevel, Access: $accLevel"
  }
}
