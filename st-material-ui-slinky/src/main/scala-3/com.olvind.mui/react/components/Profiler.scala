package com.olvind.mui.react.components

import com.olvind.mui.StBuildingComponent.Default
import com.olvind.mui.react.mod.ProfilerProps
import com.olvind.mui.scheduler.tracingMod.Interaction
import com.olvind.mui.std.Set
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Profiler {
  
  inline def apply(
    id: String,
    onRender: (/* id */ String, /* phase */ "mount" | "update", /* actualDuration */ Double, /* baseDuration */ Double, /* startTime */ Double, /* commitTime */ Double, /* interactions */ Set[Interaction]) => Unit
  ): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onRender = js.Any.fromFunction7(onRender))
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ProfilerProps]))
  }
  
  @JSImport("react", "Profiler")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ProfilerProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
