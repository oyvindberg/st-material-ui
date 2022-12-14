package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.inputBaseInputBaseMod.InputBaseComponentsPropsOverrides
import com.olvind.mui.react.mod.HTMLAttributes
import com.olvind.mui.react.mod.InputHTMLAttributes
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputRoot extends StObject {
  
  var input: js.UndefOr[InputHTMLAttributes[HTMLInputElement] & InputBaseComponentsPropsOverrides] = js.undefined
  
  var root: js.UndefOr[HTMLAttributes[HTMLDivElement] & InputBaseComponentsPropsOverrides] = js.undefined
}
object InputRoot {
  
  inline def apply(): InputRoot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputRoot]
  }
  
  extension [Self <: InputRoot](x: Self) {
    
    inline def setInput(value: InputHTMLAttributes[HTMLInputElement] & InputBaseComponentsPropsOverrides): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setRoot(value: HTMLAttributes[HTMLDivElement] & InputBaseComponentsPropsOverrides): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
