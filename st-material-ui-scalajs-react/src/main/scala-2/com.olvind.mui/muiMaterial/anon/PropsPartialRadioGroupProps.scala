package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiStyledEngine.mod.Interpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropsPartialRadioGroupProps extends StObject {
  
  var props: PartialRadioGroupProps = js.native
  
  var style: Interpolation[Theme] = js.native
}
object PropsPartialRadioGroupProps {
  
  @scala.inline
  def apply(props: PartialRadioGroupProps): PropsPartialRadioGroupProps = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsPartialRadioGroupProps]
  }
  
  @scala.inline
  implicit class PropsPartialRadioGroupPropsMutableBuilder[Self <: PropsPartialRadioGroupProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProps(value: PartialRadioGroupProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: Interpolation[Theme]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleNull: Self = StObject.set(x, "style", null)
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
