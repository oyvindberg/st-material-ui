package com.olvind.mui.muiJoy.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HelperText extends StObject {
  
  var helperText: js.UndefOr[ReactElement] = js.undefined
  
  var input: js.UndefOr[ReactElement] = js.undefined
  
  var label: js.UndefOr[ReactElement] = js.undefined
  
  var root: js.UndefOr[ReactElement] = js.undefined
}
object HelperText {
  
  inline def apply(): HelperText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HelperText]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HelperText] (val x: Self) extends AnyVal {
    
    inline def setHelperText(value: ReactElement): Self = StObject.set(x, "helperText", value.asInstanceOf[js.Any])
    
    inline def setHelperTextUndefined: Self = StObject.set(x, "helperText", js.undefined)
    
    inline def setInput(value: ReactElement): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setLabel(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setRoot(value: ReactElement): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
