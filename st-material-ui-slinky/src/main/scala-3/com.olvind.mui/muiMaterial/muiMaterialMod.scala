package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.OverridableComponentSvgIconTypeMapsvg
import com.olvind.mui.muiUtils.debounceMod.Cancelable
import com.olvind.mui.muiUtils.useControlledMod.UseControlledProps
import com.olvind.mui.muiUtils.useIsFocusVisibleMod.UseIsFocusVisibleResult
import com.olvind.mui.react.mod.DependencyList
import com.olvind.mui.react.mod.EffectCallback
import com.olvind.mui.react.mod.JSXElementConstructor
import com.olvind.mui.react.mod.MutableRefObject
import com.olvind.mui.react.mod.Ref
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Document
import org.scalajs.dom.Node
import org.scalajs.dom.Window
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object muiMaterialMod {
  
  @JSImport("@mui/material/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def capitalize(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("capitalize")(string.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def createChainedFunction[Args /* <: js.Array[Any] */, This](funcs: (js.ThisFunction1[/* this */ This, /* args */ Args, Any])*): js.ThisFunction1[/* this */ This, /* args */ Args, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("createChainedFunction")(funcs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.ThisFunction1[/* this */ This, /* args */ Args, Unit]]
  
  inline def createSvgIcon(path: ReactElement, displayName: String): OverridableComponentSvgIconTypeMapsvg = (^.asInstanceOf[js.Dynamic].applyDynamic("createSvgIcon")(path.asInstanceOf[js.Any], displayName.asInstanceOf[js.Any])).asInstanceOf[OverridableComponentSvgIconTypeMapsvg]
  
  inline def debounce[T /* <: js.Function1[/* repeated */ Any, Any] */](func: T): T & Cancelable = ^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(func.asInstanceOf[js.Any]).asInstanceOf[T & Cancelable]
  inline def debounce[T /* <: js.Function1[/* repeated */ Any, Any] */](func: T, wait: Double): T & Cancelable = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[T & Cancelable]
  
  inline def deprecatedPropType[T](validator: T, reason: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("deprecatedPropType")(validator.asInstanceOf[js.Any], reason.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def isMuiElement(element: Any, muiNames: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMuiElement")(element.asInstanceOf[js.Any], muiNames.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def ownerDocument(): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("ownerDocument")().asInstanceOf[Document]
  inline def ownerDocument(node: Node): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("ownerDocument")(node.asInstanceOf[js.Any]).asInstanceOf[Document]
  
  inline def ownerWindow(): Window = ^.asInstanceOf[js.Dynamic].applyDynamic("ownerWindow")().asInstanceOf[Window]
  inline def ownerWindow(node: Node): Window = ^.asInstanceOf[js.Dynamic].applyDynamic("ownerWindow")(node.asInstanceOf[js.Any]).asInstanceOf[Window]
  
  inline def requirePropFactory(componentNameInError: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("requirePropFactory")(componentNameInError.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def requirePropFactory(componentNameInError: String, Component: JSXElementConstructor[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("requirePropFactory")(componentNameInError.asInstanceOf[js.Any], Component.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def setRef[T](): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setRef")().asInstanceOf[Unit]
  inline def setRef[T](ref: MutableRefObject[T | Null]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setRef")(ref.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setRef[T](ref: MutableRefObject[T | Null], value: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setRef")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setRef[T](ref: js.Function1[/* instance */ T | Null, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setRef")(ref.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setRef[T](ref: js.Function1[/* instance */ T | Null, Unit], value: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setRef")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setRef[T](ref: Null, value: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setRef")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setRef[T](ref: Unit, value: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setRef")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object unstableClassNameGenerator {
    
    @JSImport("@mui/material/utils", "unstable_ClassNameGenerator")
    @js.native
    val ^ : js.Any = js.native
    
    inline def configure(generator: js.Function1[/* componentName */ String, String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(generator.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def generate(componentName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(componentName.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def reset(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Unit]
  }
  
  inline def unstableUseEnhancedEffect(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_useEnhancedEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def unstableUseEnhancedEffect(effect: EffectCallback, deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unstable_useEnhancedEffect")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def unstableUseId(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_useId")().asInstanceOf[js.UndefOr[String]]
  inline def unstableUseId(idOverride: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_useId")(idOverride.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def unsupportedProp(
    props: StringDictionary[Any],
    propName: String,
    componentName: String,
    location: String,
    propFullName: String
  ): js.Error | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("unsupportedProp")(props.asInstanceOf[js.Any], propName.asInstanceOf[js.Any], componentName.asInstanceOf[js.Any], location.asInstanceOf[js.Any], propFullName.asInstanceOf[js.Any])).asInstanceOf[js.Error | Null]
  
  inline def useControlled[T](props: UseControlledProps[T]): js.Tuple2[T, js.Function1[/* newValue */ T | (js.Function1[/* prevValue */ T, T]), Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useControlled")(props.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[T, js.Function1[/* newValue */ T | (js.Function1[/* prevValue */ T, T]), Unit]]]
  
  inline def useEventCallback[Args /* <: js.Array[Any] */, Return](fn: js.Function1[/* args */ Args, Return]): js.Function1[/* args */ Args, Return] = ^.asInstanceOf[js.Dynamic].applyDynamic("useEventCallback")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* args */ Args, Return]]
  
  inline def useForkRef[Instance](): Ref[Instance] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("useForkRef")().asInstanceOf[Ref[Instance] | Null]
  inline def useForkRef[Instance](refA: Ref[Instance]): Ref[Instance] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("useForkRef")(refA.asInstanceOf[js.Any]).asInstanceOf[Ref[Instance] | Null]
  inline def useForkRef[Instance](refA: Ref[Instance], refB: Ref[Instance]): Ref[Instance] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("useForkRef")(refA.asInstanceOf[js.Any], refB.asInstanceOf[js.Any])).asInstanceOf[Ref[Instance] | Null]
  inline def useForkRef[Instance](refA: Null, refB: Ref[Instance]): Ref[Instance] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("useForkRef")(refA.asInstanceOf[js.Any], refB.asInstanceOf[js.Any])).asInstanceOf[Ref[Instance] | Null]
  inline def useForkRef[Instance](refA: Unit, refB: Ref[Instance]): Ref[Instance] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("useForkRef")(refA.asInstanceOf[js.Any], refB.asInstanceOf[js.Any])).asInstanceOf[Ref[Instance] | Null]
  
  inline def useIsFocusVisible(): UseIsFocusVisibleResult = ^.asInstanceOf[js.Dynamic].applyDynamic("useIsFocusVisible")().asInstanceOf[UseIsFocusVisibleResult]
}
