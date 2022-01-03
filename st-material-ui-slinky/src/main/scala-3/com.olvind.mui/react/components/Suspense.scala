package com.olvind.mui.react.components

import com.olvind.mui.StBuildingComponent
import com.olvind.mui.react.mod.ReactPortal
import com.olvind.mui.react.mod.SuspenseProps
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Suspense {
  
  @JSImport("react", "Suspense")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    inline def fallback(
      value: ReactElement | String | Double | js.Object | js.Iterable[ReactElement] | ReactPortal | Boolean
    ): this.type = set("fallback", value.asInstanceOf[js.Any])
    
    inline def fallbackNull: this.type = set("fallback", null)
    
    inline def fallbackReactElement(value: ReactElement): this.type = set("fallback", value.asInstanceOf[js.Any])
    
    inline def unstable_expectedLoadTime(value: Double): this.type = set("unstable_expectedLoadTime", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Suspense.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SuspenseProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
