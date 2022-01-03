package com.olvind.mui.muiMaterial.anon

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `18`[PrimaryTypographyComponent /* <: ElementType */] extends StObject {
  
  var component: js.UndefOr[PrimaryTypographyComponent] = js.native
}
object `18` {
  
  @scala.inline
  def apply[PrimaryTypographyComponent /* <: ElementType */](): `18`[PrimaryTypographyComponent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`18`[PrimaryTypographyComponent]]
  }
  
  @scala.inline
  implicit class `18MutableBuilder`[Self <: `18`[_], PrimaryTypographyComponent /* <: ElementType */] (val x: Self with `18`[PrimaryTypographyComponent]) extends AnyVal {
    
    @scala.inline
    def setComponent(value: PrimaryTypographyComponent): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
  }
}
