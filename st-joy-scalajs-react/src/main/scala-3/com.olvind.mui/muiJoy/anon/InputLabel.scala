package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.textFieldTextFieldPropsMod.InputRootKeys
import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputLabel[P] extends StObject {
  
  var helperText: js.UndefOr[FormHelperTextPropsFormHelperTextTypeMap] = js.undefined
  
  var input: js.UndefOr[Omit[InputPropsInputTypeMapdivdefaultComponenAbout[P], InputRootKeys]] = js.undefined
  
  var label: js.UndefOr[FormLabelPropsFormLabelTypeMaplabeldefauAbout[P]] = js.undefined
  
  var root: js.UndefOr[ComponentPropsWithRef["div"]] = js.undefined
}
object InputLabel {
  
  inline def apply[P](): InputLabel[P] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputLabel[P]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputLabel[?], P] (val x: Self & InputLabel[P]) extends AnyVal {
    
    inline def setHelperText(value: FormHelperTextPropsFormHelperTextTypeMap): Self = StObject.set(x, "helperText", value.asInstanceOf[js.Any])
    
    inline def setHelperTextUndefined: Self = StObject.set(x, "helperText", js.undefined)
    
    inline def setInput(value: Omit[InputPropsInputTypeMapdivdefaultComponenAbout[P], InputRootKeys]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setLabel(value: FormLabelPropsFormLabelTypeMaplabeldefauAbout[P]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setRoot(value: ComponentPropsWithRef["div"]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
