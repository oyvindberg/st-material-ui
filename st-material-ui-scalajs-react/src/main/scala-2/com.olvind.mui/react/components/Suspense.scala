package com.olvind.mui.react.components

import com.olvind.mui.StBuildingComponent
import com.olvind.mui.react.mod.ReactPortal
import com.olvind.mui.react.mod.SuspenseProps
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Suspense {
  
  @JSImport("react", "Suspense")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends StBuildingComponent[js.Object] {
    
    @scala.inline
    def fallback(value: Element | String | Double | js.Object | js.Iterable[Node] | ReactPortal | Boolean): this.type = set("fallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fallbackNull: this.type = set("fallback", null)
    
    @scala.inline
    def fallbackVdomElement(value: VdomElement): this.type = set("fallback", value.rawElement.asInstanceOf[js.Any])
    
    @scala.inline
    def unstable_expectedLoadTime(value: Double): this.type = set("unstable_expectedLoadTime", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Suspense.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SuspenseProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
