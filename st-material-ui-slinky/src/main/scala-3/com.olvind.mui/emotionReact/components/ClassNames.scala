package com.olvind.mui.emotionReact.components

import com.olvind.mui.StBuildingComponent.Default
import com.olvind.mui.emotionReact.mod.ClassNamesContent
import com.olvind.mui.emotionReact.mod.ClassNamesProps
import com.olvind.mui.StyledComponent.Builder
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ClassNames {
  
  inline def apply(children: ClassNamesContent => ReactElement): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ClassNamesProps]))
  }
  
  @JSImport("@emotion/react", "ClassNames")
  @js.native
  val component: js.Object = js.native
  
  type Props = ClassNamesProps
  
  def styled: Builder[ClassNamesProps, Default[tag.type, js.Object]] = new Builder[ClassNamesProps, Default[tag.type, js.Object]](this.component, new js.Object, js.Array(), (newComponent: Any) => new Default[tag.type, js.Object](js.Array(newComponent, js.Dictionary.empty)))
  
  def withProps(p: ClassNamesProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
