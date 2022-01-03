package com.olvind.mui.muiMaterial.anon

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `19`[SecondaryTypographyComponent /* <: ElementType */] extends StObject {
  
  var component: js.UndefOr[SecondaryTypographyComponent] = js.native
}
object `19` {
  
  @scala.inline
  def apply[SecondaryTypographyComponent /* <: ElementType */](): `19`[SecondaryTypographyComponent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`19`[SecondaryTypographyComponent]]
  }
  
  @scala.inline
  implicit class `19MutableBuilder`[Self <: `19`[_], SecondaryTypographyComponent /* <: ElementType */] (val x: Self with `19`[SecondaryTypographyComponent]) extends AnyVal {
    
    @scala.inline
    def setComponent(value: SecondaryTypographyComponent): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
  }
}
