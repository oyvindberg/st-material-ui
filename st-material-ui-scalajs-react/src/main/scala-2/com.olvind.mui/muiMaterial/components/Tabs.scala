package com.olvind.mui.muiMaterial.components

import com.olvind.mui.StBuildingComponent.Default
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsExtendButtonBaseTypAction
import com.olvind.mui.muiMaterial.anon.OverridePropsExtendButtonBaseTypeMapButtAbout
import com.olvind.mui.muiMaterial.anon.`26`
import com.olvind.mui.muiMaterial.overridableComponentMod.DefaultComponentProps
import com.olvind.mui.muiMaterial.tabsTabsMod.TabsTypeMap
import japgolly.scalajs.react.facade.React.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for / * props * / (`com.olvind.mui`.muiMaterial.overridableComponentMod.DefaultComponentProps[
`com.olvind.mui`.muiMaterial.tabsTabsMod.TabsTypeMap[
  js.Object, 
  js.Function1[
  / * props * / `com.olvind.mui`.muiMaterial.anon.OverridePropsExtendButtonBaseTypeMapButtAbout | `com.olvind.mui`.muiMaterial.anon.DefaultComponentPropsExtendButtonBaseTypAction, 
  japgolly.scalajs.react.facade.React.Element | scala.Null
  ]
]]) & `com.olvind.mui`.muiMaterial.anon.`26` because: IArray(Couldn't find props for (js.Object | (/ * import warning: importer.ImportType#apply Failed type conversion: react.react.<global>.JSX.IntrinsicElements[T] * / js.Any) | (/ * import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ P in K ]: T[P]}
  * / `com.olvind.mui`.std.stdStrings.Pick & (js.Object | (/ * import warning: importer.ImportType#apply Failed type conversion: react.react.<global>.JSX.IntrinsicElements[T] * / js.Any)))) & `com.olvind.mui`.react.anon.`1` because: IArray(Support for combinations of intersection and union types not implemented), Couldn't find props for (scala.Any | (/ * import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ P in K ]: T[P]}
  * / `com.olvind.mui`.std.stdStrings.Pick & scala.Any)) & (`com.olvind.mui`.react.mod.RefAttributes[
`com.olvind.mui`.std.InstanceType[
  / * import warning: importer.ImportType#apply Failed type conversion: M['defaultComponent'] * / js.Any
]]) because: IArray(Could't extract props from scala.Any because couldn't resolve ClassTree., Couldn't find props for / * import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ P in K ]: T[P]}
  * / `com.olvind.mui`.std.stdStrings.Pick & scala.Any because: IArray(Could't extract props from scala.Any because couldn't resolve ClassTree.))) */
object Tabs {
  
  def apply(
    p: /* props */ (DefaultComponentProps[
      TabsTypeMap[
        js.Object, 
        js.Function1[
          /* props */ OverridePropsExtendButtonBaseTypeMapButtAbout | DefaultComponentPropsExtendButtonBaseTypAction, 
          Element | Null
        ]
      ]
    ]) with `26`
  ): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("@mui/material", "Tabs")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Tabs.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
}
