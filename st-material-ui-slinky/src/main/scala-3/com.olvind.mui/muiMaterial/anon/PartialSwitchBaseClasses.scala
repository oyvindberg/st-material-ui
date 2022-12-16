package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/material.@mui/material/internal/switchBaseClasses.SwitchBaseClasses> */
trait PartialSwitchBaseClasses extends StObject {
  
  var checked: js.UndefOr[String] = js.undefined
  
  var disabled: js.UndefOr[String] = js.undefined
  
  var edgeEnd: js.UndefOr[String] = js.undefined
  
  var edgeStart: js.UndefOr[String] = js.undefined
  
  var input: js.UndefOr[String] = js.undefined
  
  var root: js.UndefOr[String] = js.undefined
}
object PartialSwitchBaseClasses {
  
  inline def apply(): PartialSwitchBaseClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSwitchBaseClasses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialSwitchBaseClasses] (val x: Self) extends AnyVal {
    
    inline def setChecked(value: String): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setEdgeEnd(value: String): Self = StObject.set(x, "edgeEnd", value.asInstanceOf[js.Any])
    
    inline def setEdgeEndUndefined: Self = StObject.set(x, "edgeEnd", js.undefined)
    
    inline def setEdgeStart(value: String): Self = StObject.set(x, "edgeStart", value.asInstanceOf[js.Any])
    
    inline def setEdgeStartUndefined: Self = StObject.set(x, "edgeStart", js.undefined)
    
    inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
