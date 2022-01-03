package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiStyledEngine.mod.Interpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropsPartialListItemIconProps extends StObject {
  
  var props: PartialListItemIconProps = js.native
  
  var style: Interpolation[Theme] = js.native
}
object PropsPartialListItemIconProps {
  
  @scala.inline
  def apply(props: PartialListItemIconProps): PropsPartialListItemIconProps = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsPartialListItemIconProps]
  }
  
  @scala.inline
  implicit class PropsPartialListItemIconPropsMutableBuilder[Self <: PropsPartialListItemIconProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProps(value: PartialListItemIconProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: Interpolation[Theme]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleNull: Self = StObject.set(x, "style", null)
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
