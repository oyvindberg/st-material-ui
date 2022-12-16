package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiStyledEngine.mod.Interpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropsPartialScopedCssBaselinePropsdiv extends StObject {
  
  var props: PartialScopedCssBaselinePropsdiv
  
  var style: Interpolation[Theme]
}
object PropsPartialScopedCssBaselinePropsdiv {
  
  inline def apply(props: PartialScopedCssBaselinePropsdiv): PropsPartialScopedCssBaselinePropsdiv = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsPartialScopedCssBaselinePropsdiv]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PropsPartialScopedCssBaselinePropsdiv] (val x: Self) extends AnyVal {
    
    inline def setProps(value: PartialScopedCssBaselinePropsdiv): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: Interpolation[Theme]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
