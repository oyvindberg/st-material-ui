package com.olvind.mui.react.components

import com.olvind.mui.react.mod.SVGProps
import com.olvind.mui.StyledComponent.Builder
import org.scalajs.dom.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animate {
  
  type Props = SVGProps[SVGElement]
  
  val component: String = "animate"
  
  implicit def make(companion: animate.type): SharedBuilder_SVGProps_1009766722[SVGElement] = new SharedBuilder_SVGProps_1009766722[SVGElement](js.Array(this.component, js.Dictionary.empty))()
  
  def styled: Builder[SVGProps[SVGElement], SharedBuilder_SVGProps_1009766722[SVGElement]] = new Builder[SVGProps[SVGElement], SharedBuilder_SVGProps_1009766722[SVGElement]](this.component, new js.Object, js.Array(), (newComponent: Any) => new SharedBuilder_SVGProps_1009766722[SVGElement](js.Array(newComponent, js.Dictionary.empty)))
  
  def withProps(p: SVGProps[SVGElement]): SharedBuilder_SVGProps_1009766722[SVGElement] = new SharedBuilder_SVGProps_1009766722[SVGElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
