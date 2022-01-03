package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.muiBaseBooleans.`true`
import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ariainvalid extends StObject {
  
  var `aria-invalid`: js.UndefOr[`true`] = js.undefined
  
  var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.undefined
  
  var disabled: Boolean
  
  var ref: com.olvind.mui.react.mod.Ref[Any]
  
  var required: Boolean
  
  var value: js.UndefOr[String | Double | js.Array[String]] = js.undefined
}
object Ariainvalid {
  
  inline def apply(disabled: Boolean, required: Boolean): Ariainvalid = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], ref = null)
    __obj.asInstanceOf[Ariainvalid]
  }
  
  extension [Self <: Ariainvalid](x: Self) {
    
    inline def `setAria-invalid`(value: `true`): Self = StObject.set(x, "aria-invalid", value.asInstanceOf[js.Any])
    
    inline def `setAria-invalidUndefined`: Self = StObject.set(x, "aria-invalid", js.undefined)
    
    inline def setDefaultValue(value: String | Double | js.Array[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setDefaultValueVarargs(value: String*): Self = StObject.set(x, "defaultValue", js.Array(value*))
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setRef(value: com.olvind.mui.react.mod.Ref[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: Any | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String | Double | js.Array[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
