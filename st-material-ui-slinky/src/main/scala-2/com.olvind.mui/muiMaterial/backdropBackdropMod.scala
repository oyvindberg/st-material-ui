package com.olvind.mui.muiMaterial

import com.olvind.mui.muiBase.backdropUnstyledBackdropUnstyledMod.ExtendBackdropUnstyledTypeMap
import com.olvind.mui.muiMaterial.anon.DefaultComponentProps
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsBackdropTypeMapspan
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import com.olvind.mui.std.Record
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object backdropBackdropMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Backdrop](https://mui.com/components/backdrop/)
    *
    * API:
    *
    * - [Backdrop API](https://mui.com/api/backdrop/)
    * - inherits [Fade API](https://mui.com/api/fade/)
    */
  @JSImport("@mui/material/Backdrop/Backdrop", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsBackdropTypeMapspan, Element] = js.native
  
  @JSImport("@mui/material/Backdrop/Backdrop", "BackdropRoot")
  @js.native
  val BackdropRoot: ReactComponentClass[BackdropRootProps] = js.native
  
  @JSImport("@mui/material/Backdrop/Backdrop", "backdropClasses")
  @js.native
  val backdropClasses: BackdropClasses_ = js.native
  
  type BackdropClassKey = /* keyof std.NonNullable<@mui/base.anon.PartialBackdropUnstyledClasses | undefined | undefined & @mui/base.anon.PartialBackdropUnstyledClasses | undefined> */ String
  
  type BackdropClasses_ = Record[BackdropClassKey, String]
  
  type BackdropProps[D /* <: ReactElement */, P] = OverrideProps[BackdropTypeMap[D, P], D]
  
  type BackdropRootProps = /* import warning: importer.ImportType#apply Failed type conversion: std.NonNullable<@mui/base.anon.0 | undefined>['root'] */ js.Any
  
  type BackdropTypeMap[D /* <: ReactElement */, P] = ExtendBackdropUnstyledTypeMap[DefaultComponentProps[P, D]]
  
  type _To = js.Function1[/* props */ DefaultComponentPropsBackdropTypeMapspan, Element]
  
  /* This means you don't have to write `default`, but can instead just say `backdropBackdropMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsBackdropTypeMapspan, Element] = default
}
