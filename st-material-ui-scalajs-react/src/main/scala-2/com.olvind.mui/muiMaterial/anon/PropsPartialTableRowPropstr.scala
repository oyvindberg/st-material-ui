package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiStyledEngine.mod.Interpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropsPartialTableRowPropstr extends StObject {
  
  var props: PartialTableRowPropstr = js.native
  
  var style: Interpolation[Theme] = js.native
}
object PropsPartialTableRowPropstr {
  
  @scala.inline
  def apply(props: PartialTableRowPropstr): PropsPartialTableRowPropstr = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsPartialTableRowPropstr]
  }
  
  @scala.inline
  implicit class PropsPartialTableRowPropstrMutableBuilder[Self <: PropsPartialTableRowPropstr] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProps(value: PartialTableRowPropstr): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: Interpolation[Theme]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleNull: Self = StObject.set(x, "style", null)
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
