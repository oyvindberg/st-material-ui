package com.olvind.mui.muiMaterial.anon

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultComponentProps[P, D /* <: ElementType */] extends StObject {
  
  var defaultComponent: D = js.native
  
  var props: P with PartialOmitFadePropschildren with Open = js.native
}
object DefaultComponentProps {
  
  @scala.inline
  def apply[P, D /* <: ElementType */](defaultComponent: D, props: P with PartialOmitFadePropschildren with Open): DefaultComponentProps[P, D] = {
    val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultComponentProps[P, D]]
  }
  
  @scala.inline
  implicit class DefaultComponentPropsMutableBuilder[Self <: DefaultComponentProps[_, _], P, D /* <: ElementType */] (val x: Self with (DefaultComponentProps[P, D])) extends AnyVal {
    
    @scala.inline
    def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProps(value: P with PartialOmitFadePropschildren with Open): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
