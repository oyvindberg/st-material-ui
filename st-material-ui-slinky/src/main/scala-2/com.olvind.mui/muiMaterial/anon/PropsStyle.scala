package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiStyledEngine.mod.Interpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropsStyle extends StObject {
  
  var props: PartialAlertProps = js.native
  
  var style: Interpolation[Theme] = js.native
}
object PropsStyle {
  
  @scala.inline
  def apply(props: PartialAlertProps): PropsStyle = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsStyle]
  }
  
  @scala.inline
  implicit class PropsStyleMutableBuilder[Self <: PropsStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProps(value: PartialAlertProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: Interpolation[Theme]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleNull: Self = StObject.set(x, "style", null)
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
