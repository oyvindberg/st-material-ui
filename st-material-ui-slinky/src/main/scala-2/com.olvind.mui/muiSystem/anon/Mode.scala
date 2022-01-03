package com.olvind.mui.muiSystem.anon

import com.olvind.mui.muiSystem.muiSystemStrings.dark
import com.olvind.mui.muiSystem.muiSystemStrings.light
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mode extends StObject {
  
  var mode: light | dark = js.native
}
object Mode {
  
  @scala.inline
  def apply(mode: light | dark): Mode = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mode]
  }
  
  @scala.inline
  implicit class ModeMutableBuilder[Self <: Mode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMode(value: light | dark): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
