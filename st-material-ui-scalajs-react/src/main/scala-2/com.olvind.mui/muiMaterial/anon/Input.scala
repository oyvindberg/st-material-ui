package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.inputBaseInputBaseMod.InputBaseComponentsPropsOverrides
import com.olvind.mui.react.mod.HTMLAttributes
import com.olvind.mui.react.mod.InputHTMLAttributes
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Input extends StObject {
  
  var input: js.UndefOr[InputHTMLAttributes[HTMLInputElement] with InputBaseComponentsPropsOverrides] = js.native
  
  var root: js.UndefOr[HTMLAttributes[HTMLDivElement] with InputBaseComponentsPropsOverrides] = js.native
}
object Input {
  
  @scala.inline
  def apply(): Input = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Input]
  }
  
  @scala.inline
  implicit class InputMutableBuilder[Self <: Input] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInput(value: InputHTMLAttributes[HTMLInputElement] with InputBaseComponentsPropsOverrides): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    @scala.inline
    def setRoot(value: HTMLAttributes[HTMLDivElement] with InputBaseComponentsPropsOverrides): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
