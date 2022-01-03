package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiStyledEngine.mod.Interpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropsPartialTableFooterPropstfoot extends StObject {
  
  var props: PartialTableFooterPropstfoot = js.native
  
  var style: Interpolation[Theme] = js.native
}
object PropsPartialTableFooterPropstfoot {
  
  @scala.inline
  def apply(props: PartialTableFooterPropstfoot): PropsPartialTableFooterPropstfoot = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsPartialTableFooterPropstfoot]
  }
  
  @scala.inline
  implicit class PropsPartialTableFooterPropstfootMutableBuilder[Self <: PropsPartialTableFooterPropstfoot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProps(value: PartialTableFooterPropstfoot): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: Interpolation[Theme]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleNull: Self = StObject.set(x, "style", null)
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
