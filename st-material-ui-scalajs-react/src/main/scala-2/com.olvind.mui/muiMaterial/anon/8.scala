package com.olvind.mui.muiMaterial.anon

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `8`[DefaultComponent /* <: ElementType */] extends StObject {
  
  /**
    * The component used for the root node.
    * Either a string to use a HTML element or a component.
    */
  var component: js.UndefOr[DefaultComponent] = js.native
}
object `8` {
  
  @scala.inline
  def apply[DefaultComponent /* <: ElementType */](): `8`[DefaultComponent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`8`[DefaultComponent]]
  }
  
  @scala.inline
  implicit class `8MutableBuilder`[Self <: `8`[_], DefaultComponent /* <: ElementType */] (val x: Self with `8`[DefaultComponent]) extends AnyVal {
    
    @scala.inline
    def setComponent(value: DefaultComponent): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
  }
}
