package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.Components
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsBackdropTypeMapdiv
import com.olvind.mui.muiMaterial.anon.PartialOmitFadePropschildren
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.react.mod.FC
import com.olvind.mui.react.mod.global.JSX.Element
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object backdropBackdropMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Backdrop](https://mui.com/material-ui/react-backdrop/)
    *
    * API:
    *
    * - [Backdrop API](https://mui.com/material-ui/api/backdrop/)
    * - inherits [Fade API](https://mui.com/material-ui/api/fade/)
    */
  @JSImport("@mui/material/Backdrop/Backdrop", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsBackdropTypeMapdiv, Element] = js.native
  
  @JSImport("@mui/material/Backdrop/Backdrop", "BackdropRoot")
  @js.native
  val BackdropRoot: FC[BackdropRootProps] = js.native
  
  trait BackdropComponentsPropsOverrides extends StObject
  
  type BackdropProps[D /* <: ElementType */, P] = OverrideProps[BackdropTypeMap[P, D], D]
  
  type BackdropRootProps = /* import warning: importer.ImportType#apply Failed type conversion: std.NonNullable<@mui/material.anon.0 | undefined>['root'] */ js.Any
  
  trait BackdropTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & PartialOmitFadePropschildren & Components
  }
  object BackdropTypeMap {
    
    inline def apply[P, D /* <: ElementType */](defaultComponent: D, props: P & PartialOmitFadePropschildren & Components): BackdropTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[BackdropTypeMap[P, D]]
    }
    
    extension [Self <: BackdropTypeMap[?, ?], P, D /* <: ElementType */](x: Self & (BackdropTypeMap[P, D])) {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & PartialOmitFadePropschildren & Components): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsBackdropTypeMapdiv, Element]
  
  /* This means you don't have to write `default`, but can instead just say `backdropBackdropMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsBackdropTypeMapdiv, Element] = default
}
