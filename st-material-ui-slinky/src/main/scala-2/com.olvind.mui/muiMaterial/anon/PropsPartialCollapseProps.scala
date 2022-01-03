package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiStyledEngine.mod.Interpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropsPartialCollapseProps extends StObject {
  
  var props: PartialCollapseProps = js.native
  
  var style: Interpolation[Theme] = js.native
}
object PropsPartialCollapseProps {
  
  @scala.inline
  def apply(props: PartialCollapseProps): PropsPartialCollapseProps = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsPartialCollapseProps]
  }
  
  @scala.inline
  implicit class PropsPartialCollapsePropsMutableBuilder[Self <: PropsPartialCollapseProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProps(value: PartialCollapseProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: Interpolation[Theme]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleNull: Self = StObject.set(x, "style", null)
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
