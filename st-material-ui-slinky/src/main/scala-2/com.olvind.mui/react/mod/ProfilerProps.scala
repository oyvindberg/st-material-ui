package com.olvind.mui.react.mod

import com.olvind.mui.react.reactStrings.mount
import com.olvind.mui.react.reactStrings.update
import com.olvind.mui.scheduler.tracingMod.Interaction
import com.olvind.mui.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProfilerProps extends StObject {
  
  var children: js.UndefOr[slinky.core.facade.ReactElement] = js.native
  
  var id: String = js.native
  
  var onRender: ProfilerOnRenderCallback = js.native
}
object ProfilerProps {
  
  @scala.inline
  def apply(
    id: String,
    onRender: (/* id */ String, /* phase */ mount | update, /* actualDuration */ Double, /* baseDuration */ Double, /* startTime */ Double, /* commitTime */ Double, /* interactions */ Set[Interaction]) => Unit
  ): ProfilerProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onRender = js.Any.fromFunction7(onRender))
    __obj.asInstanceOf[ProfilerProps]
  }
  
  @scala.inline
  implicit class ProfilerPropsMutableBuilder[Self <: ProfilerProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: slinky.core.facade.ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnRender(
      value: (/* id */ String, /* phase */ mount | update, /* actualDuration */ Double, /* baseDuration */ Double, /* startTime */ Double, /* commitTime */ Double, /* interactions */ Set[Interaction]) => Unit
    ): Self = StObject.set(x, "onRender", js.Any.fromFunction7(value))
  }
}
