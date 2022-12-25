package com.olvind.mui.muiJoy.anon

import com.olvind.mui.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OwnerState[ComponentOwnerState, Theme] extends StObject {
  
  var ownerState: ComponentOwnerState & (Record[String, Any])
  
  var theme: Theme
}
object OwnerState {
  
  inline def apply[ComponentOwnerState, Theme](ownerState: ComponentOwnerState & (Record[String, Any]), theme: Theme): OwnerState[ComponentOwnerState, Theme] = {
    val __obj = js.Dynamic.literal(ownerState = ownerState.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[OwnerState[ComponentOwnerState, Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OwnerState[?, ?], ComponentOwnerState, Theme] (val x: Self & (OwnerState[ComponentOwnerState, Theme])) extends AnyVal {
    
    inline def setOwnerState(value: ComponentOwnerState & (Record[String, Any])): Self = StObject.set(x, "ownerState", value.asInstanceOf[js.Any])
    
    inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}
