package com.olvind.mui.muiMaterial.components

import com.olvind.mui.StBuildingComponent
import com.olvind.mui.muiMaterial.hiddenHiddenCssMod.HiddenCssProps
import com.olvind.mui.muiSystem.createThemeCreateBreakpointsMod.Breakpoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object HiddenCss {
  
  @JSImport("@mui/material/Hidden/HiddenCss", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def lgDown(value: Boolean): this.type = set("lgDown", value.asInstanceOf[js.Any])
    
    inline def lgUp(value: Boolean): this.type = set("lgUp", value.asInstanceOf[js.Any])
    
    inline def mdDown(value: Boolean): this.type = set("mdDown", value.asInstanceOf[js.Any])
    
    inline def mdUp(value: Boolean): this.type = set("mdUp", value.asInstanceOf[js.Any])
    
    inline def only(value: Breakpoint | js.Array[Breakpoint]): this.type = set("only", value.asInstanceOf[js.Any])
    
    inline def onlyVarargs(value: Breakpoint*): this.type = set("only", js.Array(value*))
    
    inline def smDown(value: Boolean): this.type = set("smDown", value.asInstanceOf[js.Any])
    
    inline def smUp(value: Boolean): this.type = set("smUp", value.asInstanceOf[js.Any])
    
    inline def xlDown(value: Boolean): this.type = set("xlDown", value.asInstanceOf[js.Any])
    
    inline def xlUp(value: Boolean): this.type = set("xlUp", value.asInstanceOf[js.Any])
    
    inline def xsDown(value: Boolean): this.type = set("xsDown", value.asInstanceOf[js.Any])
    
    inline def xsUp(value: Boolean): this.type = set("xsUp", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: HiddenCss.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def styled: com.olvind.mui.StyledComponent.Builder[HiddenCssProps, Builder] = new com.olvind.mui.StyledComponent.Builder[HiddenCssProps, Builder](this.component, new js.Object, js.Array(), (newComponent: Any) => new Builder(js.Array(newComponent, js.Dictionary.empty)))
  
  def withProps(p: HiddenCssProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
