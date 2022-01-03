package com.olvind.mui.muiMaterial.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableColorScheme extends StObject {
  
  /**
    * The content of the component.
    */
  var children: js.UndefOr[ReactElement] = js.undefined
  
  /**
    * Override or extend the styles applied to the component.
    */
  var classes: js.UndefOr[PartialScopedCssBaselineClasses] = js.undefined
  
  /**
    * Enable `color-scheme` CSS property to use `theme.palette.mode`.
    * For more details, check out https://developer.mozilla.org/en-US/docs/Web/CSS/color-scheme
    * For browser support, check out https://caniuse.com/?search=color-scheme
    */
  var enableColorScheme: js.UndefOr[Boolean] = js.undefined
}
object EnableColorScheme {
  
  inline def apply(): EnableColorScheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnableColorScheme]
  }
  
  extension [Self <: EnableColorScheme](x: Self) {
    
    inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setClasses(value: PartialScopedCssBaselineClasses): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setEnableColorScheme(value: Boolean): Self = StObject.set(x, "enableColorScheme", value.asInstanceOf[js.Any])
    
    inline def setEnableColorSchemeUndefined: Self = StObject.set(x, "enableColorScheme", js.undefined)
  }
}
