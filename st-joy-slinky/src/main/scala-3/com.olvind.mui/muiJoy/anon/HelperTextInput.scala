package com.olvind.mui.muiJoy.anon

import com.olvind.mui.react.mod.ComponentPropsWithRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HelperTextInput extends StObject {
  
  var helperText: js.UndefOr[FormHelperTextPropsFormHelperTextTypeMap] = js.undefined
  
  var input: js.UndefOr[OmitInputPropsInputTypeMapdivdefaultComp] = js.undefined
  
  var label: js.UndefOr[FormLabelPropsFormLabelTypeMaplabeldefau] = js.undefined
  
  var root: js.UndefOr[ComponentPropsWithRef["div"]] = js.undefined
}
object HelperTextInput {
  
  inline def apply(): HelperTextInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HelperTextInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HelperTextInput] (val x: Self) extends AnyVal {
    
    inline def setHelperText(value: FormHelperTextPropsFormHelperTextTypeMap): Self = StObject.set(x, "helperText", value.asInstanceOf[js.Any])
    
    inline def setHelperTextUndefined: Self = StObject.set(x, "helperText", js.undefined)
    
    inline def setInput(value: OmitInputPropsInputTypeMapdivdefaultComp): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setLabel(value: FormLabelPropsFormLabelTypeMaplabeldefau): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setRoot(value: ComponentPropsWithRef["div"]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
