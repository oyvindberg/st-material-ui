package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Exit extends StObject {
  
  var enter: js.UndefOr[Double] = js.native
  
  var exit: js.UndefOr[Double] = js.native
}
object Exit {
  
  @scala.inline
  def apply(): Exit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Exit]
  }
  
  @scala.inline
  implicit class ExitMutableBuilder[Self <: Exit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnter(value: Double): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: Double): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
