package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.textFieldTextFieldMod.TextFieldProps
import com.olvind.mui.muiStyledEngine.mod.Interpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StyleInterpolation extends StObject {
  
  var props: com.olvind.mui.std.Partial[TextFieldProps] = js.native
  
  var style: Interpolation[Theme] = js.native
}
object StyleInterpolation {
  
  @scala.inline
  def apply(props: com.olvind.mui.std.Partial[TextFieldProps]): StyleInterpolation = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleInterpolation]
  }
  
  @scala.inline
  implicit class StyleInterpolationMutableBuilder[Self <: StyleInterpolation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProps(value: com.olvind.mui.std.Partial[TextFieldProps]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: Interpolation[Theme]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleNull: Self = StObject.set(x, "style", null)
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
