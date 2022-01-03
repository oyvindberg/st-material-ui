package com.olvind.mui.muiMaterial.anon

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `6`[SubheaderTypographyComponent /* <: ElementType */] extends StObject {
  
  var component: js.UndefOr[SubheaderTypographyComponent] = js.native
}
object `6` {
  
  @scala.inline
  def apply[SubheaderTypographyComponent /* <: ElementType */](): `6`[SubheaderTypographyComponent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`6`[SubheaderTypographyComponent]]
  }
  
  @scala.inline
  implicit class `6MutableBuilder`[Self <: `6`[_], SubheaderTypographyComponent /* <: ElementType */] (val x: Self with `6`[SubheaderTypographyComponent]) extends AnyVal {
    
    @scala.inline
    def setComponent(value: SubheaderTypographyComponent): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
  }
}
