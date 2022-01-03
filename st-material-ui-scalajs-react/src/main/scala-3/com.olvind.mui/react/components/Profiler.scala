package com.olvind.mui.react.components

import com.olvind.mui.StBuildingComponent.Default
import com.olvind.mui.react.mod.ProfilerProps
import com.olvind.mui.react.reactStrings.mount
import com.olvind.mui.react.reactStrings.update
import com.olvind.mui.scheduler.tracingMod.Interaction
import com.olvind.mui.std.Set
import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Profiler {
  
  inline def apply(
    id: String,
    onRender: (/* id */ String, /* phase */ mount | update, /* actualDuration */ Double, /* baseDuration */ Double, /* startTime */ Double, /* commitTime */ Double, /* interactions */ Set[Interaction]) => Callback
  ): Default[js.Object] = {
    val __props = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onRender = js.Any.fromFunction7((t0: /* id */ String, t1: /* phase */ mount | update, t2: /* actualDuration */ Double, t3: /* baseDuration */ Double, t4: /* startTime */ Double, t5: /* commitTime */ Double, t6: /* interactions */ Set[Interaction]) => (onRender(t0, t1, t2, t3, t4, t5, t6)).runNow()))
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[ProfilerProps]))
  }
  
  @JSImport("react", "Profiler")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ProfilerProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
