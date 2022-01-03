package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Enter extends StObject {
  
  var enter: js.UndefOr[String] = js.native
  
  var exit: js.UndefOr[String] = js.native
}
object Enter {
  
  @scala.inline
  def apply(): Enter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Enter]
  }
  
  @scala.inline
  implicit class EnterMutableBuilder[Self <: Enter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnter(value: String): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: String): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
