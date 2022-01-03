package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiStyledEngine.mod.Interpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropsPartialScopedCssBaselinePropsdiv extends StObject {
  
  var props: PartialScopedCssBaselinePropsdiv = js.native
  
  var style: Interpolation[Theme] = js.native
}
object PropsPartialScopedCssBaselinePropsdiv {
  
  @scala.inline
  def apply(props: PartialScopedCssBaselinePropsdiv): PropsPartialScopedCssBaselinePropsdiv = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsPartialScopedCssBaselinePropsdiv]
  }
  
  @scala.inline
  implicit class PropsPartialScopedCssBaselinePropsdivMutableBuilder[Self <: PropsPartialScopedCssBaselinePropsdiv] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProps(value: PartialScopedCssBaselinePropsdiv): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: Interpolation[Theme]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleNull: Self = StObject.set(x, "style", null)
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
