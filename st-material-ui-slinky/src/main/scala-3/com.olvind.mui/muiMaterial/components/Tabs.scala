package com.olvind.mui.muiMaterial.components

import com.olvind.mui.StBuildingComponent
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsExtendButtonBaseTypAction
import com.olvind.mui.muiMaterial.anon.OverridePropsExtendButtonBaseTypeMapButtAbout
import com.olvind.mui.muiMaterial.anon.`26`
import com.olvind.mui.muiMaterial.overridableComponentMod.DefaultComponentProps
import com.olvind.mui.muiMaterial.stylesMod.ClassNameMap
import com.olvind.mui.muiMaterial.tabsTabsMod.TabsTypeMap
import com.olvind.mui.react.mod.CSSProperties
import com.olvind.mui.std.Partial
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tabs {
  
  @JSImport("@mui/material", "Tabs")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def classes(value: Partial[ClassNameMap[scala.Nothing]]): this.type = set("classes", value.asInstanceOf[js.Any])
    
    inline def component(value: String): this.type = set("component", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Tabs.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(
    p: /* props */ (DefaultComponentProps[
      TabsTypeMap[
        js.Object, 
        js.Function1[
          /* props */ OverridePropsExtendButtonBaseTypeMapButtAbout | DefaultComponentPropsExtendButtonBaseTypAction, 
          ReactElement | Null
        ]
      ]
    ]) & `26`
  ): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
