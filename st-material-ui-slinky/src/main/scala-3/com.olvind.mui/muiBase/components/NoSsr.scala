package com.olvind.mui.muiBase.components

import com.olvind.mui.StBuildingComponent
import com.olvind.mui.muiBase.noSsrNoSsrMod.NoSsrProps
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NoSsr {
  
  @JSImport("@mui/base", "NoSsr")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    inline def defer(value: Boolean): this.type = set("defer", value.asInstanceOf[js.Any])
    
    inline def fallback(value: ReactElement): this.type = set("fallback", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: NoSsr.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: NoSsrProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
