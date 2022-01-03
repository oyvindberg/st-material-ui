package com.olvind.mui.muiMaterial.anon

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `29`[P, D /* <: ElementType */] extends StObject {
  
  var defaultComponent: D = js.native
  
  var props: P with IconPosition = js.native
}
object `29` {
  
  @scala.inline
  def apply[P, D /* <: ElementType */](defaultComponent: D, props: P with IconPosition): `29`[P, D] = {
    val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[`29`[P, D]]
  }
  
  @scala.inline
  implicit class `29MutableBuilder`[Self <: `29`[_, _], P, D /* <: ElementType */] (val x: Self with (`29`[P, D])) extends AnyVal {
    
    @scala.inline
    def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProps(value: P with IconPosition): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
