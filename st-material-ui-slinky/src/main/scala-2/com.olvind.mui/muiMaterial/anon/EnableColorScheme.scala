package com.olvind.mui.muiMaterial.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnableColorScheme extends StObject {
  
  /**
    * The content of the component.
    */
  var children: js.UndefOr[ReactElement] = js.native
  
  /**
    * Override or extend the styles applied to the component.
    */
  var classes: js.UndefOr[PartialScopedCssBaselineClasses] = js.native
  
  /**
    * Enable `color-scheme` CSS property to use `theme.palette.mode`.
    * For more details, check out https://developer.mozilla.org/en-US/docs/Web/CSS/color-scheme
    * For browser support, check out https://caniuse.com/?search=color-scheme
    */
  var enableColorScheme: js.UndefOr[Boolean] = js.native
}
object EnableColorScheme {
  
  @scala.inline
  def apply(): EnableColorScheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnableColorScheme]
  }
  
  @scala.inline
  implicit class EnableColorSchemeMutableBuilder[Self <: EnableColorScheme] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setClasses(value: PartialScopedCssBaselineClasses): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    @scala.inline
    def setEnableColorScheme(value: Boolean): Self = StObject.set(x, "enableColorScheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableColorSchemeUndefined: Self = StObject.set(x, "enableColorScheme", js.undefined)
  }
}
