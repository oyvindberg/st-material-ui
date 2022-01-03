package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiStyledEngine.mod.Interpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropsPartialToggleButtonGroupProps extends StObject {
  
  var props: PartialToggleButtonGroupProps = js.native
  
  var style: Interpolation[Theme] = js.native
}
object PropsPartialToggleButtonGroupProps {
  
  @scala.inline
  def apply(props: PartialToggleButtonGroupProps): PropsPartialToggleButtonGroupProps = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsPartialToggleButtonGroupProps]
  }
  
  @scala.inline
  implicit class PropsPartialToggleButtonGroupPropsMutableBuilder[Self <: PropsPartialToggleButtonGroupProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProps(value: PartialToggleButtonGroupProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: Interpolation[Theme]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleNull: Self = StObject.set(x, "style", null)
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
