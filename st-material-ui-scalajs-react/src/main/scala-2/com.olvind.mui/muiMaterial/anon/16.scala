package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.listItemButtonListItemButtonMod.ListItemButtonBaseProps
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `16`[P, D /* <: ElementType */] extends StObject {
  
  var defaultComponent: D = js.native
  
  var props: P with ListItemButtonBaseProps = js.native
}
object `16` {
  
  @scala.inline
  def apply[P, D /* <: ElementType */](defaultComponent: D, props: P with ListItemButtonBaseProps): `16`[P, D] = {
    val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[`16`[P, D]]
  }
  
  @scala.inline
  implicit class `16MutableBuilder`[Self <: `16`[_, _], P, D /* <: ElementType */] (val x: Self with (`16`[P, D])) extends AnyVal {
    
    @scala.inline
    def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProps(value: P with ListItemButtonBaseProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
