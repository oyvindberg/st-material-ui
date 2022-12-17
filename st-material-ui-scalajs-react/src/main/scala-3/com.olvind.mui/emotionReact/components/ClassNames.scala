package com.olvind.mui.emotionReact.components

import com.olvind.mui.StBuildingComponent.Default
import com.olvind.mui.emotionReact.mod.ClassNamesContent
import com.olvind.mui.emotionReact.mod.ClassNamesProps
import com.olvind.mui.StyledComponent.Builder
import japgolly.scalajs.react.facade.React.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ClassNames {
  
  inline def apply(children: ClassNamesContent => Node): Default[js.Object] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[ClassNamesProps]))
  }
  
  @JSImport("@emotion/react", "ClassNames")
  @js.native
  val component: js.Object = js.native
  
  type Props = ClassNamesProps
  
  def styled: Builder[ClassNamesProps, Default[js.Object]] = new Builder[ClassNamesProps, Default[js.Object]](this.component, new js.Object, js.Array(), (newComponent: Any) => new Default[js.Object](js.Array(newComponent, js.Dictionary.empty)))
  
  def withProps(p: ClassNamesProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
