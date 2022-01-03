package com.olvind.mui.muiMaterial.anon

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnableColorScheme extends StObject {
  
  /**
    * The content of the component.
    */
  var children: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.native
  
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
    def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenNull: Self = StObject.set(x, "children", null)
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
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
