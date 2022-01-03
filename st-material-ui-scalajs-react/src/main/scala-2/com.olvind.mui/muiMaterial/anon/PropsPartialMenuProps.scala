package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiStyledEngine.mod.Interpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropsPartialMenuProps extends StObject {
  
  var props: PartialMenuProps = js.native
  
  var style: Interpolation[Theme] = js.native
}
object PropsPartialMenuProps {
  
  @scala.inline
  def apply(props: PartialMenuProps): PropsPartialMenuProps = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsPartialMenuProps]
  }
  
  @scala.inline
  implicit class PropsPartialMenuPropsMutableBuilder[Self <: PropsPartialMenuProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProps(value: PartialMenuProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: Interpolation[Theme]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleNull: Self = StObject.set(x, "style", null)
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
