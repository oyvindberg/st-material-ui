package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.muiBaseBooleans.`true`
import slinky.core.facade.ReactRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ariainvalid extends StObject {
  
  var `aria-invalid`: js.UndefOr[`true`] = js.native
  
  var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.native
  
  var disabled: Boolean = js.native
  
  var ref: com.olvind.mui.react.mod.Ref[Any] = js.native
  
  var required: Boolean = js.native
  
  var value: js.UndefOr[String | Double | js.Array[String]] = js.native
}
object Ariainvalid {
  
  @scala.inline
  def apply(disabled: Boolean, required: Boolean): Ariainvalid = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], ref = null)
    __obj.asInstanceOf[Ariainvalid]
  }
  
  @scala.inline
  implicit class AriainvalidMutableBuilder[Self <: Ariainvalid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setAria-invalid`(value: `true`): Self = StObject.set(x, "aria-invalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-invalidUndefined`: Self = StObject.set(x, "aria-invalid", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: String | Double | js.Array[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setDefaultValueVarargs(value: String*): Self = StObject.set(x, "defaultValue", js.Array(value :_*))
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRef(value: com.olvind.mui.react.mod.Ref[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefNull: Self = StObject.set(x, "ref", null)
    
    @scala.inline
    def setRefReactRef(value: ReactRef[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String | Double | js.Array[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
