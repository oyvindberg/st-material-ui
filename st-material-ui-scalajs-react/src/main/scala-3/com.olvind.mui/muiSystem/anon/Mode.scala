package com.olvind.mui.muiSystem.anon

import com.olvind.mui.muiSystem.muiSystemStrings.dark
import com.olvind.mui.muiSystem.muiSystemStrings.light
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mode extends StObject {
  
  var mode: light | dark
}
object Mode {
  
  inline def apply(mode: light | dark): Mode = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mode]
  }
  
  extension [Self <: Mode](x: Self) {
    
    inline def setMode(value: light | dark): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
